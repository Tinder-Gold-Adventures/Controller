package tinder.gold.adventures.chronos.model.traffic.track

import tinder.gold.adventures.chronos.model.mqtt.MqttPublisher
import tinder.gold.adventures.chronos.model.mqtt.MqttSubscriber
import tinder.gold.adventures.chronos.model.mqtt.builder.MqttTopicBuilder
import tinder.gold.adventures.chronos.model.traffic.core.ITrafficControl

class VesselTrack(
        override val directionTo: MqttTopicBuilder.CardinalDirection
) : ITrafficControl {
    override val componentId = 0
    override val overrideSubgroup: Int? = null
    override val laneType = MqttTopicBuilder.LaneType.VESSEL
    override val componentType = MqttTopicBuilder.ComponentType.SENSOR
    override lateinit var publisher: MqttPublisher
    override lateinit var subscriber: MqttSubscriber
}