FROM clojure
COPY . /usr/src/tree-urls-client
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/tree-urls-client
RUN lein deps
CMD ["lein", "test"]
