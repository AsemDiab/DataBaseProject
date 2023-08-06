package com.example.databaseproject;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

import java.util.Collection;

public class JasperViewerFX extends Pane {
    private JasperPrint jasperPrint;

    public JasperViewerFX(JasperPrint jasperPrint) {
        super();
        this.jasperPrint = jasperPrint;
        Platform.runLater(this::initFX);
    }

    private void initFX() {
        getChildren().setAll((Collection<? extends Node>) createReportViewer());
    }

    private JRViewer createReportViewer() {
        return new JRViewer(jasperPrint);
    }
}
