namespace _5.Polymorphism
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
            this.btn1Paramater = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.btn2Parameters = new System.Windows.Forms.Button();
            this.btn3Parameter = new System.Windows.Forms.Button();
            this.btn4Parameter = new System.Windows.Forms.Button();
            this.btnVirtual = new System.Windows.Forms.Button();
            this.btnOverrida = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btn1Paramater
            // 
            this.btn1Paramater.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btn1Paramater.Location = new System.Drawing.Point(302, 12);
            this.btn1Paramater.Name = "btn1Paramater";
            this.btn1Paramater.Size = new System.Drawing.Size(116, 58);
            this.btn1Paramater.TabIndex = 0;
            this.btn1Paramater.Text = "1 Parameter";
            this.btn1Paramater.UseVisualStyleBackColor = true;
            this.btn1Paramater.Click += new System.EventHandler(this.btn1Paramater_Click);
            // 
            // textBox1
            // 
            this.textBox1.Dock = System.Windows.Forms.DockStyle.Left;
            this.textBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.textBox1.Location = new System.Drawing.Point(0, 0);
            this.textBox1.Multiline = true;
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(296, 450);
            this.textBox1.TabIndex = 1;
            // 
            // btn2Parameters
            // 
            this.btn2Parameters.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btn2Parameters.Location = new System.Drawing.Point(302, 85);
            this.btn2Parameters.Name = "btn2Parameters";
            this.btn2Parameters.Size = new System.Drawing.Size(116, 58);
            this.btn2Parameters.TabIndex = 0;
            this.btn2Parameters.Text = "2 Parameter";
            this.btn2Parameters.UseVisualStyleBackColor = true;
            this.btn2Parameters.Click += new System.EventHandler(this.btn2Paramater_Click);
            // 
            // btn3Parameter
            // 
            this.btn3Parameter.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btn3Parameter.Location = new System.Drawing.Point(302, 159);
            this.btn3Parameter.Name = "btn3Parameter";
            this.btn3Parameter.Size = new System.Drawing.Size(116, 58);
            this.btn3Parameter.TabIndex = 0;
            this.btn3Parameter.Text = "3 Parameter";
            this.btn3Parameter.UseVisualStyleBackColor = true;
            this.btn3Parameter.Click += new System.EventHandler(this.btn3Paramater_Click);
            // 
            // btn4Parameter
            // 
            this.btn4Parameter.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btn4Parameter.Location = new System.Drawing.Point(302, 234);
            this.btn4Parameter.Name = "btn4Parameter";
            this.btn4Parameter.Size = new System.Drawing.Size(116, 58);
            this.btn4Parameter.TabIndex = 0;
            this.btn4Parameter.Text = "4 Parameter";
            this.btn4Parameter.UseVisualStyleBackColor = true;
            this.btn4Parameter.Click += new System.EventHandler(this.btn4Paramater_Click);
            // 
            // btnVirtual
            // 
            this.btnVirtual.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btnVirtual.Location = new System.Drawing.Point(302, 309);
            this.btnVirtual.Name = "btnVirtual";
            this.btnVirtual.Size = new System.Drawing.Size(116, 58);
            this.btnVirtual.TabIndex = 0;
            this.btnVirtual.Text = "Virtual";
            this.btnVirtual.UseVisualStyleBackColor = true;
            this.btnVirtual.Click += new System.EventHandler(this.btnVirtual_Click);
            // 
            // btnOverrida
            // 
            this.btnOverrida.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(254)));
            this.btnOverrida.Location = new System.Drawing.Point(302, 380);
            this.btnOverrida.Name = "btnOverrida";
            this.btnOverrida.Size = new System.Drawing.Size(116, 58);
            this.btnOverrida.TabIndex = 0;
            this.btnOverrida.Text = "Override";
            this.btnOverrida.UseVisualStyleBackColor = true;
            this.btnOverrida.Click += new System.EventHandler(this.btnOverrida_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.btnOverrida);
            this.Controls.Add(this.btnVirtual);
            this.Controls.Add(this.btn4Parameter);
            this.Controls.Add(this.btn3Parameter);
            this.Controls.Add(this.btn2Parameters);
            this.Controls.Add(this.btn1Paramater);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btn1Paramater;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button btn2Parameters;
        private System.Windows.Forms.Button btn3Parameter;
        private System.Windows.Forms.Button btn4Parameter;
        private System.Windows.Forms.Button btnVirtual;
        private System.Windows.Forms.Button btnOverrida;
    }
}

