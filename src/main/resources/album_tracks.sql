SELECT
    album_artist.album_artist,
    album.album,
    item.disc_number,
    item.track_number,
    item_extra.title,
    item_artist.item_artist,
    item_extra.year,
    base_location.path,
    item_extra.location,
    item.item_pid,
    genre.genre,
    item_extra.comment,
    item_extra.bpm,
    item_extra.total_time_ms,
    item_extra.file_size
FROM
    item
LEFT OUTER JOIN item_artist ON item.item_artist_pid = item_artist.item_artist_pid
LEFT OUTER JOIN item_extra ON item_extra.item_pid = item.item_pid
LEFT OUTER JOIN album ON item.album_pid = album.album_pid
LEFT OUTER JOIN album_artist ON album.album_artist_pid = album_artist.album_artist_pid
LEFT OUTER JOIN item_video ON item.item_pid = item_video.item_pid
LEFT OUTER JOIN base_location ON item.base_location_id = base_location.base_location_id
LEFT OUTER JOIN genre ON item.genre_id = genre.genre_id
ORDER BY
    album_artist, album, track_number, title