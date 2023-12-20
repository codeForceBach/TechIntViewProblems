package org.example.tree;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class update {

    updateGcisButton.addActionListener(e -> {


        java.util.List<String> errorList = createErrorString();
        if (errorList.size() > 0) {
            String message = "";
            for (int x = 0; x < errorList.size(); x++) {
                message = message + "\n" + errorList.get(x);
            }
            JOptionPane.showMessageDialog(createFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            createOrUpdateCancel = "update";
            createGcisButton.setEnabled(false);
            updateGcisButton.setEnabled(false);
            selectFileReadFrom.setEnabled(false);
            selectFileWriteTo.setEnabled(false);
            cancelButton.setVisible(true);
            writtenToLabel.setVisible(false);
            totalGcis = 0;
            try {
                totalGcis = PoiUtilMethods.getNumGcis(fileLocationReadFrom);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            uberPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            pbProgress.setVisible(true);
            pbProgress.setMinimum(0);
            pbProgress.setMaximum(100);
            pbProgress.setStringPainted(true);
            gcisProcessed = 0;
            pbProgress.setString(gcisProcessed + " of " + totalGcis + " GCIs processed...");
            updateGcis = new UpdateGcis();
            updateGcis.addPropertyChangeListener(evt -> {
                String name = evt.getPropertyName();
                if (name.equals("progress")) {
                    int progress = (int) evt.getNewValue();
                    pbProgress.setValue(progress);
                    gcisProcessed = gcisProcessed + 1;
                    pbProgress.setString(gcisProcessed + " of " + totalGcis + " GCIs processed...");
                    repaint();
                } else if (name.equals("state")) {
                    SwingWorker.StateValue state = (SwingWorker.StateValue) evt.getNewValue();
                    if (Objects.requireNonNull(state) == SwingWorker.StateValue.DONE) {
                        createGcisButton.setEnabled(true);
                        updateGcisButton.setEnabled(true);
                        selectFileReadFrom.setEnabled(true);
                        selectFileWriteTo.setEnabled(true);

                        writeToLocation.setText("Please select a location for results documents.");
                        cancelButton.setVisible(false);
                        pbProgress.setString("GCI updates complete");
                        writtenToLabel.setVisible(true);
                        writtenToLabel.setText("File written to: " + fileLocationWriteTo);
                        fileLocationWriteTo = null;
                        uberPanel.setCursor(Cursor.getDefaultCursor());
                    }
                }
            });
            updateGcis.setFileLocationReadFrom(fileLocationReadFrom);
            updateGcis.setFileLocationWriteTo(fileLocationWriteTo);
            updateGcis.setGcisTotal(totalGcis);
            updateGcis.execute();
            if (updateGcis.isDone() || updateGcis.isCancelled()) {
                uberPanel.setCursor(Cursor.getDefaultCursor());

            }
        }
    });
}
