package com.example.fxshell.models.FileManager.State.States;


import com.example.fxshell.models.FileManager.FileManager;
import com.example.fxshell.models.FileManager.State.FileManagerState;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class DeleteState extends FileManagerState {

    @Override
    public void perform(FileManager ctx) {
        try {
            delete(ctx.getSource());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(File source) throws IOException {
        if (source == null) return;
        if (source.isDirectory()) FileUtils.deleteDirectory(source);
        else if (source.isFile()) FileUtils.delete(source);
    }
}
