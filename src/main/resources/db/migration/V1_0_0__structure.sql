create table inbox(
    id uuid primary key,
    status varchar not null default 'New',
    created_at timestamp not null default now()
);
