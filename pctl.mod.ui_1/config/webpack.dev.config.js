const fs = require('fs');

const webpackMerge = require('webpack-merge');
const DefinePlugin = require('webpack/lib/DefinePlugin');
const webpack = require('webpack');
const CommonsChunkPlugin = require('webpack/lib/optimize/CommonsChunkPlugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const {ENV, validateConfig, baseWebpackConfig, absolutePath} = require('./webpack.commons.js');


const environment = process.env.NODE_ENV = process.env.ENV = ENV.DEV;

const inlinedCss = fs.readFileSync('./src/main/frontend/css/inline.css', {encoding: 'utf8'});

module.exports = validateConfig(webpackMerge(baseWebpackConfig, {
  devtool: 'cheap-module-source-map',
  metadata: {
    ENV: environment,
    host: 'localhost',
    port: 3000
  },
  entry: {
    'styles': './src/main/frontend/scss/main.scss',
    'polyfills': './src/main/frontend/polyfills.ts',
    'vendor': './src/main/frontend/vendor.ts',
    'main': './src/main/frontend/main.ts'
  },
  output: {
    path: absolutePath('../src/main/resources/static/'),
    filename: '[name].bundle.js',
    sourceMapFilename: '[name].map',
    chunkFilename: '[id].chunk.js',
    publicPath: 'http://localhost:3000/'
  },
  // Webpack Development Server config
  devServer: {
    port: 3000,
    host: 'localhost',
    contentBase: './src/main/frontend',
    outputPath: './tmp/',
    historyApiFallback: true,
    watchOptions: {
      aggregateTimeout: 300,
      poll: 1000
    },
    //Enable if you want
    proxy: {
      // '/api/*': 'http://localhost:8080',
    },
    quiet: false,
    noInfo: false
  },
  module: {
    loaders: [
      {
        test: /\.ts$/,
        loader: 'awesome-typescript-loader'
      },
      // Saas config
      {
        test: /main\.scss$/,
        loader: 'style!css?sourceMap!postcss!sass?sourceMap'
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
    emitErrors: false,
    failOnHint: false
  },
  plugins: [
    new DefinePlugin({
      'ENV': JSON.stringify(environment),
      'HMR': (ENV.DEV === environment)
    }),
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
      minify: false,
      inlineCss: '<style>' + inlinedCss + '</style>'
    })
  ]
}));
