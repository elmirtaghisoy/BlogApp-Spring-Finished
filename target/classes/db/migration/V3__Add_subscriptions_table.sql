create table user_subscriptions (
    channel_id bigint not null references user ,
    subscriber_id bigint not null references user,
    primary key (channel_id,subscriber_id)
)