package br.com.movieapp.movie_popular_feature.data.searce

import br.com.movieapp.core.data.remote.MovieService
import br.com.movieapp.core.data.remote.response.MovieResponse
import br.com.movieapp.movie_popular_feature.domain.source.MoviePopularRemoteDataSource
import br.com.movieapp.paging.MoviePagingSource

class MoviePopularRemoteDataSourceImpl constructor(
    private val service: MovieService,
) : MoviePopularRemoteDataSource {

    override fun getPopularMoviesPagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page)
    }
}