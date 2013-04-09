(ns cc.iterator.nodes.vm
  "VM node definition"
  (:require
    [pallet.api :as api]))

(def vm-node-spec
  (api/node-spec
    :image    {:os-family :ubuntu
               :os-version-matches "12.04"}
    :hardware {:min-ram 1024}
    :network  {:inbound-ports [22]}))
