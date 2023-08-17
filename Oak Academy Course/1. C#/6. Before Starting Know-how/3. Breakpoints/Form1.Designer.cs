namespace _3.Breakpoints
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblMidterm = new System.Windows.Forms.Label();
            this.lblFinal = new System.Windows.Forms.Label();
            this.lblGPT = new System.Windows.Forms.Label();
            this.txtMidterm = new System.Windows.Forms.TextBox();
            this.txtFinal = new System.Windows.Forms.TextBox();
            this.txtGPT = new System.Windows.Forms.TextBox();
            this.btnCalculate = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblMidterm
            // 
            this.lblMidterm.AutoSize = true;
            this.lblMidterm.Location = new System.Drawing.Point(71, 62);
            this.lblMidterm.Name = "lblMidterm";
            this.lblMidterm.Size = new System.Drawing.Size(73, 13);
            this.lblMidterm.TabIndex = 0;
            this.lblMidterm.Text = "Midterm Exam";
            // 
            // lblFinal
            // 
            this.lblFinal.AutoSize = true;
            this.lblFinal.Location = new System.Drawing.Point(71, 118);
            this.lblFinal.Name = "lblFinal";
            this.lblFinal.Size = new System.Drawing.Size(58, 13);
            this.lblFinal.TabIndex = 1;
            this.lblFinal.Text = "Final Exam";
            // 
            // lblGPT
            // 
            this.lblGPT.AutoSize = true;
            this.lblGPT.Location = new System.Drawing.Point(71, 240);
            this.lblGPT.Name = "lblGPT";
            this.lblGPT.Size = new System.Drawing.Size(29, 13);
            this.lblGPT.TabIndex = 2;
            this.lblGPT.Text = "GPT";
            // 
            // txtMidterm
            // 
            this.txtMidterm.Location = new System.Drawing.Point(163, 59);
            this.txtMidterm.Name = "txtMidterm";
            this.txtMidterm.Size = new System.Drawing.Size(100, 20);
            this.txtMidterm.TabIndex = 3;
            // 
            // txtFinal
            // 
            this.txtFinal.Location = new System.Drawing.Point(163, 111);
            this.txtFinal.Name = "txtFinal";
            this.txtFinal.Size = new System.Drawing.Size(100, 20);
            this.txtFinal.TabIndex = 4;
            // 
            // txtGPT
            // 
            this.txtGPT.Location = new System.Drawing.Point(163, 237);
            this.txtGPT.Name = "txtGPT";
            this.txtGPT.Size = new System.Drawing.Size(100, 20);
            this.txtGPT.TabIndex = 5;
            // 
            // btnCalculate
            // 
            this.btnCalculate.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalculate.Location = new System.Drawing.Point(163, 157);
            this.btnCalculate.Name = "btnCalculate";
            this.btnCalculate.Size = new System.Drawing.Size(100, 56);
            this.btnCalculate.TabIndex = 6;
            this.btnCalculate.Text = "Calculate";
            this.btnCalculate.UseVisualStyleBackColor = true;
            this.btnCalculate.Click += new System.EventHandler(this.btnCalculate_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnCalculate);
            this.Controls.Add(this.txtGPT);
            this.Controls.Add(this.txtFinal);
            this.Controls.Add(this.txtMidterm);
            this.Controls.Add(this.lblGPT);
            this.Controls.Add(this.lblFinal);
            this.Controls.Add(this.lblMidterm);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblMidterm;
        private System.Windows.Forms.Label lblFinal;
        private System.Windows.Forms.Label lblGPT;
        private System.Windows.Forms.TextBox txtMidterm;
        private System.Windows.Forms.TextBox txtFinal;
        private System.Windows.Forms.TextBox txtGPT;
        private System.Windows.Forms.Button btnCalculate;
    }
}

