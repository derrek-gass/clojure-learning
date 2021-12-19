(ns clojure-noob.core
  (:gen-class))

(def words (str "Inconvenienced"))
(def words2 (str "dead"))

(defn error-message [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         words words2)))

(def chewie "Chewbacca")
(str "\"Ugglglglllgllgllgl\" - " chewie)

(defn train
  []
  (println "Choo Choo!"))

(defn -main [args]
  (error-message args))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY THE MOST "
       "AMAZING WOMAN EVER! I LOVE YOU SO MUCH!"))