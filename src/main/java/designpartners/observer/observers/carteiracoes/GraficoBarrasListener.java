package designpartners.observer.observers.carteiracoes;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Machine
 * 
 * Componente grafico que observa a carteira de acoes
 */
public class GraficoBarrasListener implements Observador {

	private DefaultCategoryDataset dataSet;
	private JFrame frame = new JFrame();
	
	public GraficoBarrasListener () {
		dataSet = new DefaultCategoryDataset();
		JFreeChart chart = ChartFactory.createBarChart("Carteira de Ações", 
													  "Siglas", 
													  "Quantidade",
													  dataSet, 
													  PlotOrientation.VERTICAL,
													  false, 
													  true, 
													  false);

		ChartPanel chartPanel = new ChartPanel(chart);
		
		frame.setContentPane(chartPanel);
		frame.setSize(500, 270);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void mudancaQuantidade(String acao, Integer quantidade) {
		dataSet.setValue(quantidade, "Quantidade", acao);
	}

}
