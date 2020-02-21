public class Main9 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Group group = new Group();
		Scene scene = new Scene(group);
		primaryStage.setScene(scene);
		primaryStage.setTitle("javafx");
		primaryStage.setWidth(600);
		primaryStage.setHeight(600);
		
		//输入框
		TextField text = new TextField();
		text.setText(null);//输入框中默认文字
		//text.setPrefSize(200, 50);//定义输入框的宽和高
		
		//设置输入框的位置
		text.setLayoutX(100);
		text.setLayoutY(100);
		
		//当鼠标放上去的时候的小提示
		Tooltip tip = new Tooltip("这是提示");
		tip.setFont(Font.font(40));//设置提示的字体大小
		text.setTooltip(tip);
		
		//文本框内的灰色提示字体
		text.setPromptText("请输入7个字");
		text.setFocusTraversable(false);//把默认焦点取消
		
		//限制输入的长度
		text.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				if(newValue.length()>7) {
					text.setText(oldValue);
				}
			}
			
		});
		//选中
		text.selectedTextProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				System.out.println(newValue);
			}
		});
		
		//密码框
		PasswordField pw = new PasswordField();
		
		//标签
		Label l = new Label("我是标签");
		l.setLayoutX(400);
		l.setLayoutY(400);
		l.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				System.out.println("标签的单击事件");
			}
		});
		group.getChildren().add(text);
		group.getChildren().add(pw);
		group.getChildren().add(l);
		primaryStage.show();
	}

}
