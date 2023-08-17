namespace _1.If_else_statement
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
            this.label1 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.btnIf = new System.Windows.Forms.Button();
            this.btnIfElse = new System.Windows.Forms.Button();
            this.btnMessage = new System.Windows.Forms.Button();
            this.btnTernary = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(252, 78);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "label1";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(255, 121);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 20);
            this.textBox1.TabIndex = 1;
            // 
            // btnIf
            // 
            this.btnIf.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIf.Location = new System.Drawing.Point(388, 107);
            this.btnIf.Name = "btnIf";
            this.btnIf.Size = new System.Drawing.Size(95, 46);
            this.btnIf.TabIndex = 2;
            this.btnIf.Text = "IF";
            this.btnIf.UseVisualStyleBackColor = true;
            this.btnIf.Click += new System.EventHandler(this.btnIf_Click);
            // 
            // btnIfElse
            // 
            this.btnIfElse.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIfElse.Location = new System.Drawing.Point(501, 107);
            this.btnIfElse.Name = "btnIfElse";
            this.btnIfElse.Size = new System.Drawing.Size(87, 45);
            this.btnIfElse.TabIndex = 3;
            this.btnIfElse.Text = "IF-ELSE";
            this.btnIfElse.UseVisualStyleBackColor = true;
            this.btnIfElse.Click += new System.EventHandler(this.btnIfElse_Click);
            // 
            // btnMessage
            // 
            this.btnMessage.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMessage.Location = new System.Drawing.Point(605, 107);
            this.btnMessage.Name = "btnMessage";
            this.btnMessage.Size = new System.Drawing.Size(106, 45);
            this.btnMessage.TabIndex = 4;
            this.btnMessage.Text = "Message";
            this.btnMessage.UseVisualStyleBackColor = true;
            this.btnMessage.Click += new System.EventHandler(this.btnMessage_Click);
            // 
            // btnTernary
            // 
            this.btnTernary.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnTernary.Location = new System.Drawing.Point(388, 173);
            this.btnTernary.Name = "btnTernary";
            this.btnTernary.Size = new System.Drawing.Size(95, 48);
            this.btnTernary.TabIndex = 5;
            this.btnTernary.Text = "Ternary";
            this.btnTernary.UseVisualStyleBackColor = true;
            this.btnTernary.Click += new System.EventHandler(this.btnTernary_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnTernary);
            this.Controls.Add(this.btnMessage);
            this.Controls.Add(this.btnIfElse);
            this.Controls.Add(this.btnIf);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button btnIf;
        private System.Windows.Forms.Button btnIfElse;
        private System.Windows.Forms.Button btnMessage;
        private System.Windows.Forms.Button btnTernary;
    }
}

