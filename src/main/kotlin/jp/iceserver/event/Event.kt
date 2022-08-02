package jp.iceserver.event

class Event : AbstractEvent()
{
    companion object
    {
        lateinit var plugin: Event
    }

    override fun onEnable()
    {
        plugin = this
    }
}