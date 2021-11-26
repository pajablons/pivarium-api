package com.pivarium.piv_rest.apiclass

import org.springframework.data.annotation.Id

class Station {
    @Id
    String id

    String uuid
    String extensionPath

    Station() {
        this.uuid = UUID.randomUUID().toString().replace("-", "")
    }

    Station(String uuid, String extensionPath) {
        this.uuid = uuid
        this.extensionPath = extensionPath
    }

    String toString() {
        return String.format(
                "Station[uuid=%s]", this.uuid
        )
    }

    boolean equals(Station other) {
        return this.uuid == other.uuid
    }
}
