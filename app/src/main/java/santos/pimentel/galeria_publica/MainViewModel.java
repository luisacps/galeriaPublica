package santos.pimentel.galeria_publica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

// funcao que herda da especializacao da viewmodel, android viewmodel
// isso permite o acesso ao contexto da aplicação, importante na parte de paginação
public class MainViewModel extends AndroidViewModel {

    // variavel que guarda a opcao selecionada pelo usuario no menu
    int navigationOpSelected = R.id.gridViewOp;

    public MainViewModel (@NonNull Application application) {
        super(application);
    }

    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }
}
