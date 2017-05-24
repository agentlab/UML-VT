package org.eclipse.uml.verification.view;

import org.eclipse.ui.IPageLayout;

import org.eclipse.ui.IPerspectiveFactory;

import org.eclipse.ui.IFolderLayout;

public class MyPerspective implements IPerspectiveFactory {
 
 private static final float LEFT_RATIO = 0.15F;
 
 private static final float RIGHT_RATIO = 0.75F;
 
 private static final float BOTTOM_RATIO = 0.75F;
 
 @Override
 public void createInitialLayout(IPageLayout layout) {
  
  String editorArea = layout.getEditorArea();
  
  
  // Add View in left side area of the editor space
  IFolderLayout leftLayout = layout.createFolder("leftLayout", IPageLayout.LEFT, LEFT_RATIO, editorArea);
  leftLayout.addView(IPageLayout.ID_PROJECT_EXPLORER);
  leftLayout.addPlaceholder(IPageLayout.ID_BOOKMARKS);
  
  // Add View in right side area of the editor space
  IFolderLayout rightLayout = layout.createFolder("rightLayout", IPageLayout.RIGHT, RIGHT_RATIO, editorArea);
 
  rightLayout.addView("view1");
  rightLayout.addPlaceholder(IPageLayout.ID_TASK_LIST);
  
  // Add View in the bottom area in separate way
  layout.addView("org.eclipse.ui.console.ConsoleView", IPageLayout.BOTTOM, BOTTOM_RATIO, editorArea);
 }
}

