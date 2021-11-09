(ns tutorial.destruct)

(defn destruct []
  (def myVet [1 2 3 4 5])
  (println myVet)
  (let [[a b c] myVet] (println a b c))
  (let [[a b & rest] myVet] (println a b rest))

  (def myMap {'name "Glauber" 'lastName "Hermany"})
  (println myMap)
  (let [{a 'name b 'lastName} myMap] (println a b))
  (let [{a 'name b 'lastName c 'noName} myMap] (println a b c))
  )
(destruct)