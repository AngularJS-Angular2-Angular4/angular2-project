const webpackMerge = require('webpack-merge');
const DefinePlugin = require('webpack/lib/DefinePlugin');
const SourceMapDevToolPlugin = require('webpack/lib/SourceMapDevToolPlugin');

const {ENV, validateConfig, baseWebpackConfig, absolutePath} = require('./webpack.commons.js');

const environment = process.env.NODE_ENV = process.env.ENV = ENV.TEST;

module.exports = validateConfig(webpackMerge(baseWebpackConfig, {
  devtool: 'inline-source-map',
  stats: {
    colors: true,
    reasons: true
  },
  metadata: {
    ENV: environment
  },
  module: {
    loaders: [
      {
        test: /\.ts$/,
        loader: 'awesome-typescript-loader',
        query: {
          sourceMap: false,
          inlineSourceMap: true
        }
      },
      {
        test: /main\.scss$/,
        loader: 'style!css!sass'
      },
      {
        test: /\.scss$/,
        loader: 'raw!sass',
        exclude: [
          absolutePath('../src/main/frontend/scss/main.scss')
        ]
      }
    ],
    postLoaders: [
      // instrument only testing sources with Istanbul
      {
        test: /\.(js|ts)$/,
        include: absolutePath('../src/main/frontend'),
        loader: 'istanbul-instrumenter-loader',
        exclude: [
          /\.(e2e|spec)\.ts$/,
          /node_modules/
        ]
      }
    ]
  },
  plugins: [
    new SourceMapDevToolPlugin({
      filename: null, // if no value is provided the sourcemap is inlined
      test: /\.(ts|js)($|\?)/i // process .js and .ts files only
    }),
    new DefinePlugin({
      'ENV': JSON.stringify(environment),
      'HMR': (ENV.DEV === environment)
    })
  ]
}));
