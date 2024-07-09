DELETE FROM trip;
DELETE FROM app_user;
DELETE FROM spot;

INSERT INTO spot (spot_id, location_name, latitude, longitude, tide_station_id)
VALUES
(1, 'Castle Haven Bay', -4.1925652, 54.8083162, '0265'),
(2, 'Kirkandrews Bay', -4.1885101, 54.8072633, '0308'),
(3, 'Unknown', -4.259116, 54.837657, '0309'),
(4, 'Ross Bay', -4.0919856, 54.7785707, '0310'),
(5, 'Ringdoo Sands', -4.8105347, 54.8492277, '0310A'),
(6, 'Roker Beach', -1.3671113, 54.9285419, '0310B'),
(7, 'Whitburn Sands', -1.3659152, 54.9314947, '0311'),
(8, 'Tynemouth Longsands', -1.4232026, 55.0197293, '0311A'),
(9, 'Bamburgh Beach', -1.7195213, 55.6062097, '0312'),
(10, 'Seaburn Beach', -1.3767934, 54.9249723, '0313'),
(11, 'South Shields Beach', -1.4173152, 54.9879942, '0314'),
(12, 'Whitley Bay', -1.4475943, 55.0502631, '0314A'),
(13, 'Blyth Beach', -1.5075686, 55.1266329, '0316'),
(14, 'Druridge Bay', -1.5493858, 55.235633, '0317'),
(15, 'Newbiggin-by-the-Sea', -1.5117774, 55.186135, '0318'),
(16, 'Cresswell Beach', -1.527779, 55.247395, '0318A'),
(17, 'Alnmouth Beach', -1.6155665, 55.3840332, '0320'),
(18, 'Warkworth Beach', -1.6142972, 55.3576397, '0321'),
(19, 'Amble Links', -1.583502, 55.333837, '0321A'),
(20, 'Boulmer Haven', -1.617201, 55.405376, '0323'),
(21, 'Beadnell Bay', -1.635396, 55.483702, '0330'),
(22, 'Seahouses Beach', -1.657981, 55.576992, '0332'),
(23, 'Holy Island', -1.790219, 55.685302, '0333'),
(24, 'Embleton Bay', -1.635683, 55.486521, '0334'),
(25, 'Low Newton by the Sea', -1.631545, 55.484119, '0336'),
(26, 'Craster Beach', -1.597043, 55.474339, '0336A'),
(27, 'Hauxley Beach', -1.568313, 55.326838, '0337'),
(28, 'Seaton Sluice Beach', -1.490009, 55.082343, '0338'),
(29, 'Hartley Bay', -1.482506, 55.086682, '0338A'),
(30, 'Cullercoats Bay', -1.437715, 55.033211, '0339'),
(31, 'King Edward''s Bay', -1.424469, 55.021671, '0340'),
(32, 'Browns Bay', -1.454003, 55.042171, '0341'),
(33, 'Sandhaven Beach', -1.417812, 54.994549, '0342'),
(34, 'Marsden Beach', -1.385612, 54.973402, '0343'),
(35, 'Redcar Beach', -1.060905, 54.618109, '0344'),
(36, 'Saltburn Beach', -1.038909, 54.583502, '0345'),
(37, 'Skinningrove Beach', -0.905953, 54.565359, '0346'),
(38, 'Runswick Bay', -0.747777, 54.531211, '0349'),
(39, 'Sandsend Beach', -0.678113, 54.500122, '0349A'),
(40, 'Whitby Beach', -0.613018, 54.483975, '0351'),
(41, 'Robin Hood''s Bay', -0.532939, 54.431302, '0352'),
(42, 'Scarborough North Bay', -0.406295, 54.290372, '0353'),
(43, 'Scarborough South Bay', -0.395682, 54.277004, '0353A'),
(44, 'Filey Beach', -0.295465, 54.209318, '0353B'),
(45, 'Hunmanby Gap', -0.289634, 54.177544, '0354'),
(46, 'Reighton Sands', -0.254115, 54.164208, '0354A'),
(47, 'Bridlington North Beach', -0.189898, 54.083622, '0355'),
(48, 'Bridlington South Beach', -0.188191, 54.077062, '0356'),
(49, 'Fraisthorpe Beach', -0.192612, 54.029187, '0357'),
(50, 'Hornsea Beach', -0.166876, 53.912768, '0359'),
(51, 'Mappleton Beach', -0.168494, 53.883279, '0360'),
(52, 'Withernsea Beach', -0.040319, 53.733628, '0361'),
(53, 'Easington Beach', 0.030782, 53.639453, '0362'),
(54, 'Cleethorpes Beach', -0.021949, 53.560373, '0363'),
(55, 'Mablethorpe Beach', 0.268772, 53.338448, '0364'),
(56, 'Sutton-on-Sea Beach', 0.280114, 53.311038, '0364A'),
(57, 'Skegness Beach', 0.342091, 53.147926, '0365'),
(58, 'Ingoldmells Beach', 0.335981, 53.192921, '0365A'),
(59, 'Chapel St Leonards Beach', 0.334164, 53.216082, '0265'),
(60, 'Anderby Creek', 0.334644, 53.259003, '0308'),
(61, 'Huttoft Beach', 0.334219, 53.283874, '0309'),
(62, 'Sutton Bridge', 0.190389, 52.768291, '0310'),
(63, 'Heacham Beach', 0.487401, 52.912197, '0310A'),
(64, 'Hunstanton Beach', 0.493311, 52.944252, '0310B'),
(65, 'Holme-next-the-Sea', 0.515329, 52.963318, '0311'),
(66, 'Brancaster Beach', 0.607072, 52.977674, '0311A'),
(67, 'Burnham Overy Staithe', 0.734057, 52.966627, '0312'),
(68, 'Wells-next-the-Sea', 0.853834, 52.953418, '0313'),
(69, 'Holkham Beach', 0.809235, 52.948287, '0314'),
(70, 'Blakeney Point', 1.048934, 52.974244, '0314A'),
(71, 'Sheringham Beach', 1.208456, 52.944162, '0316'),
(72, 'West Runton Beach', 1.249901, 52.938406, '0317'),
(73, 'Cromer Beach', 1.303383, 52.931571, '0318'),
(74, 'Overstrand Beach', 1.335401, 52.921041, '0318A'),
(75, 'Mundesley Beach', 1.435843, 52.872419, '0320'),
(76, 'Happisburgh Beach', 1.538567, 52.815134, '0321'),
(77, 'Sea Palling Beach', 1.618331, 52.777463, '0321A'),
(78, 'Horsey Beach', 1.659021, 52.728591, '0323'),
(79, 'Winterton-on-Sea', 1.686004, 52.715611, '0330'),
(80, 'Hemsby Beach', 1.699768, 52.702822, '0332'),
(81, 'Caister-on-Sea', 1.719283, 52.642195, '0333'),
(82, 'Great Yarmouth Beach', 1.734904, 52.608284, '0334'),
(83, 'Gorleston Beach', 1.733876, 52.570417, '0336'),
(84, 'Lowestoft Beach', 1.753132, 52.480562, '0336A'),
(85, 'Kessingland Beach', 1.719021, 52.426193, '0337'),
(86, 'Southwold Beach', 1.681945, 52.325938, '0338'),
(87, 'Dunwich Beach', 1.626784, 52.269182, '0338A'),
(88, 'Thorpeness Beach', 1.613583, 52.179114, '0339'),
(89, 'Aldeburgh Beach', 1.600572, 52.152621, '0340'),
(90, 'Orford Beach', 1.555041, 52.096282, '0341'),
(91, 'Bawdsey Beach', 1.415781, 51.993419, '0342'),
(92, 'Felixstowe Beach', 1.352616, 51.966893, '0343'),
(93, 'Harwich Beach', 1.280742, 51.943238, '0344'),
(94, 'Clacton Beach', 1.149456, 51.787572, '0345'),
(95, 'Frinton-on-Sea', 1.239163, 51.837511, '0346'),
(96, 'Walton-on-the-Naze', 1.272916, 51.855563, '0349'),
(97, 'Mersea Island', 0.947627, 51.776611, '0349A'),
(98, 'Brightlingsea Beach', 1.025219, 51.805539, '0351'),
(99, 'Southend-on-Sea', 0.727565, 51.538294, '0352'),
(100, 'Shoeburyness Beach', 0.792653, 51.541713, '0353')
ON CONFLICT (spot_id) DO NOTHING;

INSERT INTO app_user (id, user_name, location, profile_text, skill_level, email)
VALUES
(1, 'Ste', 'UK', 'Not much of a surfer', 0, 'ste@gmail.com'),
(2, 'Tom', 'UK', 'Not much of a surfer', 0, 'tom@gmail.com'),
(3, 'Francis', 'UK', 'Not much of a surfer', 0, 'francis@gmail.com'),
(4, 'Jonah', 'UK', 'Quite the surfer', 2, 'jonah@gmail.com')
ON CONFLICT (id) DO NOTHING;

INSERT INTO trip (trip_id, info_rating, surf_rating, spot_id, user_id, gusts, wave_direction, wave_height, wave_period, wind_direction, wind_speed, low_tide_height, high_tide_height, high_tide_date, low_tide_date)
VALUES
(1, 3, 4, 3, 2, 1.8, 2.2, 'NW', 1.7, 2.1, 'NE', 2.8, 1.9, 2.9, '2024-07-11T03:21:00', '2024-07-11T09:21:00'),
(2, 5, 2, 1, 3, 2.5, 1.5, 'SE', 2.2, 2.5, 'S', 3.0, 2.1, 2.8, '2024-07-11T05:21:00', '2024-07-11T11:21:00'),
(3, 2, 5, 4, 1, 1.5, 3.0, 'E', 1.9, 2.3, 'NE', 2.6, 2.0, 2.7, '2024-07-11T01:21:00', '2024-07-11T07:21:00'),
(4, 4, 3, 2, 4, 1.7, 2.7, 'SW', 2.0, 2.4, 'W', 2.9, 1.8, 2.6, '2024-07-11T02:21:00', '2024-07-11T08:21:00'),
(5, 1, 1, 5, 2, 2.0, 2.5, 'NW', 2.1, 2.2, 'N', 2.5, 2.2, 2.5, '2024-07-11T04:21:00', '2024-07-11T10:21:00'),
(6, 4, 5, 3, 1, 1.6, 2.8, 'W', 2.3, 2.6, 'SW', 2.7, 1.7, 2.4, '2024-07-11T03:21:00', '2024-07-11T09:21:00'),
(7, 3, 2, 1, 4, 2.3, 1.7, 'NE', 2.4, 2.7, 'E', 2.5, 2.3, 2.8, '2024-07-11T05:21:00', '2024-07-11T11:21:00'),
(8, 5, 4, 5, 3, 1.9, 2.9, 'S', 2.5, 2.8, 'SE', 2.8, 1.6, 2.3, '2024-07-11T01:21:00', '2024-07-11T07:21:00'),
(9, 2, 3, 2, 1, 2.2, 2.4, 'NW', 2.6, 2.9, 'N', 2.9, 2.1, 2.6, '2024-07-11T02:21:00', '2024-07-11T08:21:00'),
(10, 3, 1, 4, 2, 1.8, 2.6, 'SW', 2.7, 2.2, 'W', 3.0, 1.9, 2.7, '2024-07-11T04:21:00', '2024-07-11T10:21:00'),
(11, 5, 3, 1, 3, 2.0, 2.2, 'SE', 2.8, 2.5, 'S', 2.6, 2.0, 2.9, '2024-07-11T03:21:00', '2024-07-11T09:21:00'),
(12, 1, 4, 5, 4, 1.5, 3.0, 'E', 1.7, 2.3, 'NE', 2.8, 1.8, 2.5, '2024-07-11T05:21:00', '2024-07-11T11:21:00'),
(13, 4, 2, 3, 2, 1.7, 2.5, 'W', 2.0, 2.4, 'SW', 2.9, 1.7, 2.4, '2024-07-11T01:21:00', '2024-07-11T07:21:00'),
(14, 2, 5, 2, 1, 2.0, 2.7, 'NW', 2.1, 2.2, 'N', 2.5, 2.2, 2.5, '2024-07-11T02:21:00', '2024-07-11T08:21:00'),
(15, 3, 3, 4, 3, 1.6, 2.8, 'NE', 2.3, 2.6, 'E', 2.7, 1.8, 2.6, '2024-07-11T04:21:00', '2024-07-11T10:21:00'),
(16, 5, 2, 1, 2, 2.3, 1.7, 'S', 2.4, 2.7, 'SE', 2.5, 2.3, 2.8, '2024-07-11T03:21:00', '2024-07-11T09:21:00'),
(17, 2, 4, 5, 1, 1.9, 2.9, 'NW', 2.5, 2.8, 'N', 2.8, 1.6, 2.3, '2024-07-11T05:21:00', '2024-07-11T11:21:00'),
(18, 4, 3, 3, 4, 2.2, 2.4, 'SW', 2.6, 2.9, 'W', 2.9, 2.1, 2.6, '2024-07-11T01:21:00', '2024-07-11T07:21:00'),
(19, 1, 1, 2, 3, 1.8, 2.6, 'SE', 2.7, 2.2, 'S', 3.0, 1.9, 2.7, '2024-07-11T02:21:00', '2024-07-11T08:21:00'),
(20, 4, 5, 4, 2, 2.0, 2.2, 'E', 2.8, 2.5, 'NE', 2.6, 2.0, 2.9, '2024-07-11T04:21:00', '2024-07-11T10:21:00'),
(21, 3, 2, 1, 1, 1.5, 3.0, 'W', 1.7, 2.3, 'SW', 2.8, 1.8, 2.5, '2024-07-11T03:21:00', '2024-07-11T09:21:00'),
(22, 5, 4, 5, 4, 1.6, 2.5, 'NW', 2.0, 2.4, 'N', 2.9, 1.7, 2.4, '2024-07-11T05:21:00', '2024-07-11T11:21:00'),
(23, 2, 3, 3, 3, 2.0, 2.7, 'NE', 2.1, 2.2, 'E', 2.5, 2.2, 2.5, '2024-07-11T01:21:00', '2024-07-11T07:21:00'),
(24, 3, 1, 2, 2, 1.7, 2.8, 'NW', 2.3, 2.6, 'N', 2.7, 1.8, 2.6, '2024-07-11T02:21:00', '2024-07-11T08:21:00'),
(25, 1, 4, 4, 1, 2.3, 1.7, 'SE', 2.4, 2.7, 'S', 2.5, 2.3, 2.8, '2024-07-11T04:21:00', '2024-07-11T10:21:00')
ON CONFLICT (trip_id) DO NOTHING;
