package rahma.androidfirst.mymovies

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [FilmEntity::class, SerieEntity::class, ActeurEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun myMoviesDao(): MyMoviesDao
}
