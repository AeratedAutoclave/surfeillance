INSERT INTO spot (spot_id, location_name, latitude, longitude, tide_station_id)
VALUES
(1, 'Castle Haven Bay', -4.1925652, 54.8083162, '0324'),
(2, 'Kirkandrews Bay', -4.1885101, 54.8072633, '0324'),
(3, 'Unknown', -4.259116, 54.837657, '0324'),
(4, 'Ross Bay', -4.0919856, 54.7785707, '0324'),
(5, 'Ringdoo Sands', -4.8105347, 54.8492277, '0324')
ON CONFLICT (spot_id) DO NOTHING;

INSERT INTO app_user (id, user_name, location, profile_text, skill_level)
VALUES
(1, 'Ste', 'UK', 'Not much of a surfer', 0),
(2, 'Tom', 'UK', 'Not much of a surfer', 0),
(3, 'Francis', 'UK', 'Not much of a surfer', 0),
(4, 'Jonah', 'UK', 'Quite the surfer', 2)
ON CONFLICT (id) DO NOTHING;

INSERT INTO trip (trip_id, info_rating, surf_rating, spot_id, user_id, wave_height, wave_direction, wave_period, wind_speed, wind_direction, gusts, tide_height)
VALUES
(1, 2, 3, 3, 1, 1.2, 'NW', 1.5, 2.0, 'NE', 7, 1.8),
(2, 4, 5, 1, 2, 1.8, 'SE', 2.1, 1.3, 'SW', 5, 1.2),
(3, 1, 2, 4, 3, 2.3, 'E', 2.3, 1.5, 'NW', 6, 2.0),
(4, 3, 4, 2, 1, 0.9, 'S', 1.9, 2.1, 'N', 4, 0.8),
(5, 5, 1, 5, 4, 2.5, 'W', 2.2, 1.7, 'E', 8, 1.5),
(6, 2, 2, 3, 2, 1.1, 'NW', 1.8, 1.9, 'NE', 7, 1.1),
(7, 4, 3, 1, 3, 1.3, 'SW', 2.0, 1.4, 'SE', 3, 1.0),
(8, 3, 1, 5, 4, 2.0, 'NE', 2.4, 2.2, 'SW', 9, 1.9),
(9, 1, 5, 2, 1, 1.6, 'S', 1.7, 1.8, 'N', 5, 2.4),
(10, 5, 4, 4, 3, 0.8, 'E', 1.2, 1.2, 'W', 2, 0.7),
(11, 4, 2, 1, 4, 2.1, 'N', 2.3, 2.3, 'S', 6, 2.1),
(12, 2, 5, 3, 2, 1.7, 'W', 1.8, 1.0, 'E', 4, 1.7),
(13, 3, 3, 2, 1, 2.4, 'NE', 2.0, 1.6, 'SE', 8, 2.3),
(14, 1, 4, 5, 4, 0.6, 'SW', 1.1, 1.5, 'NE', 3, 1.0),
(15, 5, 2, 4, 2, 1.0, 'NW', 1.6, 2.2, 'S', 9, 1.4),
(16, 3, 5, 1, 3, 2.5, 'S', 2.2, 1.4, 'N', 5, 2.2),
(17, 4, 1, 3, 1, 0.7, 'E', 1.4, 1.9, 'W', 1, 0.9),
(18, 2, 4, 2, 4, 1.4, 'N', 2.5, 2.0, 'S', 8, 1.3),
(19, 1, 3, 5, 2, 2.3, 'W', 1.5, 1.6, 'E', 3, 2.0),
(20, 5, 5, 4, 1, 0.5, 'NE', 1.2, 1.3, 'NW', 2, 0.5),
(21, 4, 4, 3, 3, 2.1, 'SE', 2.0, 1.7, 'SW', 4, 1.2),
(22, 2, 1, 2, 4, 1.5, 'NW', 2.1, 1.8, 'NE', 7, 2.1),
(23, 3, 2, 1, 1, 2.4, 'SW', 1.9, 2.0, 'SE', 6, 1.6),
(24, 1, 1, 5, 2, 0.8, 'S', 1.4, 1.1, 'N', 5, 0.7),
(25, 5, 3, 4, 3, 1.3, 'E', 2.2, 1.5, 'W', 3, 2.4)
ON CONFLICT (trip_id) DO NOTHING;
