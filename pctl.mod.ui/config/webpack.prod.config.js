const fs = require('fs');

const webpack = require('webpack');
const ProvidePlugin = require('webpack/lib/ProvidePlugin');
const DedupePlugin = require('webpack/lib/optimize/DedupePlugin');
const UglifyJsPlugin = require('webpack/lib/optimize/UglifyJsPlugin');
const CommonsChunkPlugin = require('webpack/lib/optimize/CommonsChunkPlugin');
const WebpackMd5Hash = require('webpack-md5-hash');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const ExtractTextPlugin = require("extract-text-webpack-plugin");
const webpackMerge = require('webpack-merge');
const DefinePlugin = require('webpack/lib/DefinePlugin');

const {ENV, validateConfig, baseWebpackConfig, absolutePath} = require('./webpack.commons.js');

const environment = process.env.NODE_ENV = process.env.ENV = ENV.PROD;

const inlinedCss = fs.readFileSync('./src/main/frontend/css/inline.css', {encoding: 'utf8'});

const extractCSS = new ExtractTextPlugin('[name].[contenthash].css');

module.exports = validateConfig(webpackMerge(baseWebpackConfig, {
  devtool: 'source-map',
  cache: false,
  metadata: {
    ENV: environment
  },
  resolve: {
    cache: false
  },
  entry: {
    'styles': './src/main/frontend/scss/main.scss',
    'polyfills': './src/main/frontend/polyfills.ts',
    'vendor': './src/main/frontend/vendor.ts',
    'main': './src/main/frontend/main.ts'
  },
  output: {
    path: absolutePath('../src/main/resources/static'),
    filename: '[name].[chunkhash].bundle.js',
    sourceMapFilename: '[name].[chunkhash].bundle.map',
    chunkFilename: '[id].[chunkhash].chunk.js',
    publicPath: '/'
  },
  module: {
    loaders: [
      {
        test: /\.ts$/,
        loader: 'awesome-typescript-loader'
      },
      {
        test: /main\.scss$/,
        loader: extractCSS.extract(['css?sourceMap', 'postcss', 'sass?sourceMap'])
      },
      {
        test: /\.scss$/,
        loader: 'raw!postcss!sass',
        exclude: [
          absolutePath('../src/main/frontend/scss/main.scss')
        ]
      }
    ]
  },
  tslint: {
    emitErrors: true,
    failOnHint: true
  },
  plugins: [
    new DefinePlugin({
      'ENV': JSON.stringify(environment),
      'HMR': (ENV.DEV === environment)
    }),
    extractCSS,
    new WebpackMd5Hash(),
    new DedupePlugin(),
    new webpack.optimize.OccurrenceOrderPlugin(true),
    new CommonsChunkPlugin({
      name: ['vendor', 'polyfills'],
      minChunks: Infinity
    }),
    new CopyWebpackPlugin([
      {
        from: './src/main/frontend/assets',
        to: 'assets'
      }
    ]),
    new HtmlWebpackPlugin({
      template: './src/main/frontend/index.html',
      chunksSortMode: 'dependency',
      minify: {minimize: true, removeComments: true, preserveLineBreaks: true, collapseWhitespace: true},
      inlineCss: '<style>' + inlinedCss + '</style>'
    }),
    new webpack.LoaderOptionsPlugin({
      minimize: true,
      debug: false
    }),
    new UglifyJsPlugin({
      beautify: false,
      minify: true,
      mangle: {
        screw_ie8: true,
        // [RC5]: Minified bundle breaks #10618
        //https://github.com/angular/angular/issues/10618
        keep_fnames: true
      },
      compress: {
        screw_ie8: true
      },
      comments: false
    })
  ],
  // Teach html-minifier about Angular 2 syntax
  htmlLoader: {
    minimize: true,
    removeAttributeQuotes: false,
    caseSensitive: true,
    customAttrSurround: [
      [/#/, /(?:)/],
      [/\*/, /(?:)/],
      [/\[?\(?/, /(?:)/]
    ],
    customAttrAssign: [/\)?\]?=/],
    removeComments: true,
    preserveLineBreaks: true,
    collapseWhitespace: true
  }
}));
