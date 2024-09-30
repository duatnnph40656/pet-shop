package com.petshop.swing.table;

import com.petshop.swing.model.ModelStudent;

public interface EventAction {

    public void delete(ModelStudent student);

    public void update(ModelStudent student);
}
