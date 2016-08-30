(defproject org.cyverse/tree-urls-client "2.8.0"
  :description "Client for the tree-urls service"
  :url "https://github.com/cyverse-de/tree-urls-client"
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.cyverse/clojure-commons "2.8.0" :exclusions [buddy/buddy-sign metosin/compojure-api metosin/ring-http-response ring]]
                 [slingshot "0.12.2"]
                 [clj-http "2.0.0"]
                 [com.cemerick/url "0.1.1" :exclusions [com.cemerick/clojurescript.test]]
                 [cheshire "5.5.0"]])
