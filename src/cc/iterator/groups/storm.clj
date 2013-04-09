(ns cc.iterator.groups.storm
  "Group defintion for a Storm cluster"
  (:require
   [pallet.api :as api]
   [cc.iterator.nodes.vm :refer [vm-node-spec]]
   [cc.iterator.servers.base :refer [base-server]]
   [pallet.crate.java :refer [server-spec]]))
   ; [cc.iterator.crate.zookeeper :refer [server-spec]]))

(def
  ^{:doc "Defines a group spec that can be passed to converge or lift."}
  storm-group-spec
  (api/group-spec
   "storm"
   ; :extends [base-server (pallet.crate.java/java {}) (cc.iterator.crate.zookeeper/server-spec {})]
   :extends [base-server (pallet.crate.java/server-spec {})]
   :node-spec vm-node-spec))
