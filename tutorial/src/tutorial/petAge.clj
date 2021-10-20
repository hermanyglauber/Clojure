(ns tutorial.petAge
  (:gen-class))

(defn getAgeTransformationRatio [x]
  (def petStore {'dog 7, 'cat 5, 'fish 10})
  (get petStore x)
  )

(defn petAgeHumanConverter
  [petType petAge]
  (* (getAgeTransformationRatio petType) petAge)
  )