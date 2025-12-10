package builder.design.builder.task_builder_message;

public class messageBuilderMian {
    public static void main(String[] args) {
        MessageBuilder builder=new MessageBuilder.Builder()
                .setContent("content")
                .setDelivered(true)
                .setMessageType(MessageBuilder.MessageType.AUDIO)
                .setSender("rahul")
                .setTimestamp(1221025)
                .setRecipient("rahul")
                .build();
        System.out.println(builder);
    }

}
