package com.gitlab.kordlib.kordx.commands.kord.context

import com.gitlab.kordlib.core.event.message.MessageCreateEvent
import com.gitlab.kordlib.kordx.commands.command.CommandContext

object KordContext : CommandContext<MessageCreateEvent, MessageCreateEvent, KordEvent>