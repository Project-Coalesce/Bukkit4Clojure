(ns ^{:author      "Project Coalesce"
      :description "An example plugin for Bukkit4Clojure"}
com.coalesce.bukkitforclojure.example.example
  (:gen-class)
  (:import [org.bukkit.plugin PluginDescriptionFile]
           [org.bukkit.configuration.file FileConfiguration]
           [com.coalesce.bukkitforclojure Main]
           [java.io File]
           [org.bukkit Server]
           [java.util.logging Logger]
           [org.bukkit.event.player PlayerJoinEvent]
           [org.bukkit.event EventPriority]))

(def ^Main wrapperMain)
(def ^File dataFolder)
(def ^FileConfiguration config)
(def ^PluginDescriptionFile pdf)
(def ^Server server)
(def ^Logger logger)

(defn onEnable
  []
  (.registerEvent wrapperMain PlayerJoinEvent (EventPriority/NORMAL) (fn [event] (com.coalesce.bukkitforclojure.example.listener/playerJoinedHandler event)))
  (.registerCommand wrapperMain "clojure" #(com.coalesce.bukkitforclojure.example.command/clojureCommand %1 %2 %3 %4))
  )

(defn setData
  [^Main wrapperMain_
   ^File dataFolder_
   ^FileConfiguration config_
   ^PluginDescriptionFile pdf_
   ^Server server_
   ^Logger logger_]
  (def wrapperMain wrapperMain_)
  (def dataFolder dataFolder_)
  (def config config_)
  (def pdf pdf_)
  (def server server_)
  (def logger logger_)
  )