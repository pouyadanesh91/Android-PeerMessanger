package com.danesh.nilvapeerchallenge.peer

data class PeerModel(
    val peerId: Long,
    val peerName: String,
    val peerCode: String,
    val date: String
) {
    override fun toString(): String {
        return "PeerModel(peerId=$peerId, peerName='$peerName', peerCode='$peerCode', date='$date')"
    }
}
