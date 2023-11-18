package br.com.movieapp.movie_popular_feature.presentation


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import br.com.movieapp.movie_popular_feature.domain.usecase.GetPopularMoviesUserCase
import br.com.movieapp.movie_popular_feature.presentation.state.MoviePopularState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviePopularViewModel @Inject constructor(
    getPopularMoviesUserCase: GetPopularMoviesUserCase
) : ViewModel(){

    var uiState by mutableStateOf(MoviePopularState())
    private set

    init {
        val movies = getPopularMoviesUserCase.invoke()
            .cachedIn(viewModelScope)

        uiState = uiState.copy(movies = movies)
    }

}