FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/tree-urls-client

COPY project.clj /usr/src/tree-urls-client/
RUN lein deps

COPY . /usr/src/tree-urls-client
CMD ["lein", "test"]
