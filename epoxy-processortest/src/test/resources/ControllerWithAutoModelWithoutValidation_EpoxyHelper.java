package com.airbnb.epoxy.adapter;

import com.airbnb.epoxy.BasicModelWithAttribute_;
import com.airbnb.epoxy.ControllerHelper;
import java.lang.Override;

/**
 * Generated file. Do not modify! */
public class ControllerWithAutoModelWithoutValidation_EpoxyHelper extends ControllerHelper<ControllerWithAutoModelWithoutValidation> {
  private final ControllerWithAutoModelWithoutValidation controller;

  public ControllerWithAutoModelWithoutValidation_EpoxyHelper(ControllerWithAutoModelWithoutValidation controller) {
    this.controller = controller;
  }

  @Override
  public void resetAutoModels() {
    controller.modelWithAttribute1 = new BasicModelWithAttribute_();
    controller.modelWithAttribute1.id(-1);
    setControllerToStageTo(controller.modelWithAttribute1, controller);
    controller.modelWithAttribute2 = new BasicModelWithAttribute_();
    controller.modelWithAttribute2.id(-2);
    setControllerToStageTo(controller.modelWithAttribute2, controller);
  }
}