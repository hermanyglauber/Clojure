(ns tutorial.conditionals
  (:gen-class))

(defn nestedIfConditional []
  (if (and (= 3 3) (or (not= 7 7) false))
    (println "True")
    (println "False")
    )
  )
(nestedIfConditional)

(defn ifDoConditional []
  (if true
    (do (println "sum" (+ 2 3)) (println "will get here"))
    (do (println "wont reach here"))
    )
  )
(ifDoConditional)

(defn caseConditional [pet]
  (case pet
    "cat" (println "I have a" pet)
    "dog" (println "I have a" pet)
    )
  )
(caseConditional "cat")

(defn condConditional [amount]
  (cond
    (<= amount 2) (println "few")
    (<= amount 5) (println "some")
    :else (println "many"))
)
(condConditional 3)