public class Application {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();

        editor.onPressSaveButton();
        editor.onMenuSaveOption();
        editor.onShortcut();
    }
}