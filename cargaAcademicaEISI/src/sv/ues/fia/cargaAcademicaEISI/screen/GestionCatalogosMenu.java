package sv.ues.fia.cargaAcademicaEISI.screen;

import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.GridFieldManager;
import net.rim.device.api.ui.container.MainScreen;

public class GestionCatalogosMenu extends MainScreen implements
		FieldChangeListener {
	private BitmapButtonField gstDeptoMenu;
	private Bitmap bmptabla1;
	private String nombre;
	private Bitmap bmp0;
	private LabelField lb1;

	public GestionCatalogosMenu(String opcion) {
		setTitle(opcion);
		nombre = opcion;
		bmptabla1 = Bitmap.getBitmapResource("tabla1.png");
		lb1 = new LabelField("Tabla Departamento");

		GridFieldManager grid = new GridFieldManager(2, 5,
				GridFieldManager.USE_ALL_HEIGHT
						| GridFieldManager.USE_ALL_HEIGHT
						| GridFieldManager.FIXED_SIZE);
		gstDeptoMenu.setChangeListener(this);
		
		grid.insert(gstDeptoMenu, 0, 0);
		grid.insert(lb1, 0, 1);
		
		add(grid);
	}

	public void fieldChanged(Field field, int context) {
		if (field == gstDeptoMenu) {
			if (nombre == "Admin. de Catalogos")
				UiApplication.getUiApplication().pushScreen(new MenuGestion("Gestion tabla Departamento"));
		}
	}

}