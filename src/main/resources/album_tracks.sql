SELECT
    album_artist.album_artist,
    album.album,
    item_extra.title,
    item_artist.item_artist,
    item_extra.year,
    item_extra.location,
    item.item_pid
FROM
	item
INNER JOIN item_artist ON item.item_artist_pid = item_artist.item_artist_pid
INNER JOIN item_extra ON item_extra.item_pid = item.item_pid
INNER JOIN album ON album.album_pid = item.album_pid
INNER JOIN album_artist ON album.album_artist_pid = album_artist.album_artist_pid
INNER JOIN item_video ON item_video.item_pid = item.item_pid
