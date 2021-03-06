package core;

import java.util.Set;
import java.util.SortedSet;

public interface PubSubCommand {

    Message execute(Message m, SortedSet<Message> log, Set<String> subscribers, boolean isPrimary, String sencondaryServerAddress, int secondaryServerPort);

}
