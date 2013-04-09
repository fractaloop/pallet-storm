(defproject cc.iterator "0.0.1"
  :source-paths ["src"]
  :description "Union Metrics infrastructure automation"
  :dependencies [[org.clojure/clojure "1.4.0"]

                 ;; The latest pallet
                 [com.palletops/pallet "0.8.0-beta.7"]

                 ;; Deploy to VirtualBox for testing
                 [org.cloudhoist/pallet-vmfest "0.3.0-alpha.3"]
                 [org.clojars.tbatchelli/vboxjxpcom "4.2.4"]

                 ;; Crates
                 ; [com.palletops/lein-crate "0.8.0-alpha.1"]
                 [com.palletops/java-crate "0.8.0-beta.2"]
                 ; [com.palletops/zookeeper-crate "0.8.0-SNAPSHOT"]
                 ; [com.palletops/git-crate "0.8.0-alpha.1"]
                 ; [com.palletops/riemann-crate "0.8.0-alpha.1"]

                 ;; The latest jclouds fun
                 [org.cloudhoist/pallet-jclouds "1.5.2"]


                 [org.jclouds/jclouds-allcompute "1.5.9"]
                 [org.jclouds.driver/jclouds-slf4j "1.5.9"]
                 [org.jclouds.driver/jclouds-jsch "1.5.9"]
                 [com.jcraft/jsch "0.1.49"] ; jclouds-jsch will only use 0.1.48 which doesn't have the right API
                 [org.jclouds/jclouds-compute "1.5.9"]
                 [org.jclouds/jclouds-blobstore "1.5.9"]
                 [org.jclouds/jclouds-allblobstore "1.5.9"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]]

  :exclusions [org.jclouds/jclouds-allblobstore
               org.jclouds/jclouds-allcompute
               org.jclouds/jclouds-compute
               org.jclouds/jclouds-blobstore
               org.jclouds.driver/jclouds-slf4j
               org.jclouds.driver/jclouds-jsch]

  :profiles {:dev {:plugins [[com.palletops/pallet-lein "0.6.0-beta.9"]]}}

  :local-repo-classpath true

  :repositories {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
                 "sonatype" "https://oss.sonatype.org/content/repositories/releases/"})
