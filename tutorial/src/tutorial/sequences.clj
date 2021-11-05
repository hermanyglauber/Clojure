(ns tutorial.sequences)

(defn Seq []
  (def colors (seq [ "blue" "green" "red"]))

  (println colors)
  (println (cons colors "yellow"))
  (println (cons "yellow" colors))
  (println (conj colors "yellow"))
  (println (conj ["yellow"] "white"))
  (println (concat colors (seq ["black" "white"])))
  (println (distinct (seq [1 2 2 2 4 5 3 2 1])))
  (println (sort (seq [1 2 2 2 4 5 3 2 1])))
  (println (reverse colors))
  (println (first colors))
  (println (last colors))
  (println (rest colors))
)
(Seq)