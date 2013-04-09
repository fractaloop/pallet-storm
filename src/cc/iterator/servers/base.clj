(ns cc.iterator.servers.base
  "Base server definition"
  (:require
    [pallet.api :as api]
    [pallet.crate.automated-admin-user :as admin-user]
    [pallet.actions :refer [package-manager]]))

(def
  ^{:doc "Defines the base node for others servers to run on"}
  base-server
  (api/server-spec
    :phases
    {:bootstrap (api/plan-fn (admin-user/automated-admin-user))
     :configure (api/plan-fn (package-manager :update))}))
