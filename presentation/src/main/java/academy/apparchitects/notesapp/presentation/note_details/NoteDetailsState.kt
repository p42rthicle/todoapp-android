package academy.apparchitects.notesapp.presentation.note_details

import kotlinx.datetime.Instant
import java.util.UUID

sealed interface NoteDetailsState {
  data object Loading : NoteDetailsState

  data class Success(
    val noteId: UUID? = null,
    val title: String? = null,
    val desc: String? = null,
    val note: String? = null,
    val createdOn: Instant,
  ) : NoteDetailsState

  data class Error(
    val errorMsg: String
  ) : NoteDetailsState
}