
import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public boolean removeNote(String date, String time) {
        return notes.removeIf(note -> note.getDate().equals(date) && note.getTime().equals(time));
    }

    public List<Note> findNotesByDate(String date) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getDate().equals(date)) {
                result.add(note);
            }
        }
        return result;
    }

    public void sortNotes() {
        notes.sort((note1, note2) -> {
            int dateComparison = note1.getDate().compareTo(note2.getDate());
            if (dateComparison != 0) {
                return dateComparison;
            }
            return note1.getTime().compareTo(note2.getTime());
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Note note : notes) {
            sb.append(note.toString()).append("\n");
        }
        return sb.toString();
    }
}
