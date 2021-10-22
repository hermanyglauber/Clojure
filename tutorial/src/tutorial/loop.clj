(ns tutorial.loop
  (:gen-class))


(defn Loop []
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))
))
(Loop)

(defn DoTimes []
  (dotimes [x 10]
    (println x))
  )
(DoTimes)

(defn WhileDo [count]
  (def x (atom 0))
  (while (< @x 10)
    (do
      (println @x)
      (swap! x inc)))
  )
(WhileDo 10)

(defn DoSeq [seq]
  (doseq [x seq]
    (println (inc x)))
  )
(DoSeq [1 5 5 6])