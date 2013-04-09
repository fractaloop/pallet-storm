;;; Pallet project configuration file

;;; By default, the pallet.api and pallet.crate namespaces are already referred.
;;; The pallet.crate.automated-admin-user/automated-admin-user us also referred.

(require 'cc.iterator.groups.storm)

(defproject cc.iterator
  :provider :vmfest
  :groups [cc.iterator.groups.storm/storm-group-spec])
