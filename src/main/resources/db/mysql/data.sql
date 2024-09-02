INSERT INTO users (username, email, password) VALUES
('john_doe', 'john@example.com', 'password123'),
('jane_doe', 'jane@example.com', 'securepassword'),
('alice_smith', 'alice@example.com', 'alicepass'),
('bob_jones', 'bob@example.com', 'bobpassword');


INSERT INTO posts (title, content, user_id) VALUES
('First Post', 'This is the content of the first post.', 1),
('Second Post', 'This is the content of the second post.', 2),
('Interesting Post', 'This is a really interesting post.', 3),
('Another Post', 'Here is some more content for another post.', 1);



INSERT INTO comments (post_id, user_id, content) VALUES
(1, 2, 'Great post, John!'),
(1, 3, 'Thanks for sharing this!'),
(2, 1, 'Nice post, Jane!'),
(3, 4, 'Very interesting post, Alice.'),
(4, 2, 'Thanks for the information, John!');



INSERT INTO categories (name, description) VALUES
('Technology', 'Posts about the latest in technology.'),
('Lifestyle', 'Posts about lifestyle and daily habits.'),
('Education', 'Posts about education and learning.'),
('Travel', 'Posts about travel experiences and tips.');



INSERT INTO tags (name) VALUES
('Tech'),
('Health'),
('Learning'),
('Adventure'),
('Tips');




INSERT INTO post_tags (post_id, tag_id) VALUES
(1, 1),
(1, 3),
(2, 2),
(3, 4),
(4, 5),
(2, 5);
