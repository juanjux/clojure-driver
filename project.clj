(defproject babelfish-clojure-driver "0.1.0-SNAPSHOT"
  :description "Babelfish clojure driver"
  :url "https://github.com/bblfsh/clojure-driver"
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.analyzer "0.6.9"]
                 [org.clojure/tools.analyzer.jvm "0.7.0"]
                 [clojure-msgpack "1.2.0"]]
  :main ^:skip-aot babelfish-clojure-driver.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
