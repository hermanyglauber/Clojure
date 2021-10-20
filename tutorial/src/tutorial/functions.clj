(ns tutorial.functions
  (:gen-class))

(defn -main
  "Main for functions"
  []
  (println "My name is Glauber")
  (println "Loving Clojure so far")
  (+ 1 2 3)
  )

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))

(defn vars []
  (def a 3)
  (def A 5)

  (println a)
  (println A)
  )