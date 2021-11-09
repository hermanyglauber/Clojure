(ns tutorial.structMaps)

(defn structMaps []
  (defstruct pet :petName :petType)

  (def myPet (struct pet "Jack" "dog"))
  (println myPet)

  (def myOtherPet (struct-map pet :petName "Maya" :petType "dog"))
  (println myOtherPet)

  (def myNewPet (assoc myPet :petName "Chica"))
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :petAge 18))
  (println myNewOtherPet)
  )
(structMaps)
