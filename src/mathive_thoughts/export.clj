(ns mathive-thoughts.export
  (:require [mathive-thoughts.core :as blog]
            [powerpack.export :as export]))

(defn ^:export export! [& _args]
  (-> (blog/create-app)
      (assoc :site/base-url "https://mathivethoughts.no")
      export/export!))
