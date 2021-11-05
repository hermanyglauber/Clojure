(ns tutorial.atoms
  (:gen-class))

(defn Atoms []
  (def amount (atom 100))
  (println @amount)

  (swap! amount inc)
  (println @amount)

  (compare-and-set! amount 101 120)
  (println @amount)

  (compare-and-set! amount 101 150)
  (println @amount)

  (reset! amount 100)
  (println @amount)
  )
(Atoms)