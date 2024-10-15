import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterPosition> characters = new ArrayList<>();
    private CharacterFactory characterFactory = new CharacterFactory();

    private class CharacterPosition {
        Character character;
        int x, y;

        public CharacterPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }

    public void insertText(String text, String font, int size, int startX, int startY, int spacing) {
        int x = startX;
        int y = startY;
        for (char ch : text.toCharArray()) {
            Character character = characterFactory.getCharacter(ch, font, size);
            characters.add(new CharacterPosition(character, x, y));
            x += spacing;
        }

    }

    public void renderDocument() {
        for (CharacterPosition characterPosition : characters) {
            characterPosition.render();
        }
    }

}
